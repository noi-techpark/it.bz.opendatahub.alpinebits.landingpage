# Infrastructure for it.bz.opendatahub.alpinebits.landingpage

The AlpineBits LandingPage
[alpinebits.opendatahub.com](https://alpinebits.opendatahub.com) consists of
a S3 bucket on AWS that hosts the static web application. In addition to this,
we want to redirect also
[alpinebits.opendatahub.com/AlpineBits](https://alpinebits.opendatahub.com/AlpineBits),
which is the regular API endpoint to the main landing page, if the request
method is `GET`. All other API calls on that endpoint are `POST` requests.

## Servers

### Production Environment
#### Web frontend
- S3 Bucket to host the static webpage `alpinebits.lp-prod`
- URL = https://alpinebits.opendatahub.com
- ALIASES = N/A
- The domain (managed by TT Digital) points to proxy.opendatahub.com, which redirects it to the S3 bucket

### Testing Environment
#### Web frontend
- S3 Bucket to host the static webpage `alpinebits.lp-test`
- URL = https://alpinebits.opendatahub.testingmachine.eu
- The domain (managed by TT Digital) points to proxy.opendatahub.com, which redirects it to the S3 bucket

## External resources
None at the moment.

## Continuous Deployment
See https://github.com/noi-techpark/it.bz.opendatahub.alpinebits.landingpage/actions

- On testing the static web app will be automatically deployed on each push to the main branch
- On production the static web app will be manually deployed from the prod branch

## Continous Integration
See https://github.com/noi-techpark/it.bz.opendatahub.alpinebits.landingpage/actions

- The CI pipeline runs on every branch including pull requests and gives feedback to the Github repo

## Repositories
- https://github.com/noi-techpark/it.bz.opendatahub.alpinebits.landingpage
