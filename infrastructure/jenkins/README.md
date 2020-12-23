# Infrastructure for it.bz.opendatahub.alpinebits.landingpage

The AlpineBits LandingPage
[alpinebits.opendatahub.bz.it](https://alpinebits.opendatahub.bz.it) consists of
a S3 bucket on AWS that hosts the static web application. In addition to this,
we want to redirect also
[alpinebits.opendatahub.bz.it/AlpineBits](https://alpinebits.opendatahub.bz.it/AlpineBits),
which is the regular API endpoint to the main landing page, if the request
method is `GET`. All other API calls on that endpoint are `POST` requests.

## Servers

### Production Environment
#### Web frontend
- S3 Bucket to host the static webpage `alpinebits.lp-prod`
- URL = https://alpinebits.opendatahub.bz.it
- ALIASES = N/A
- The domain (managed by TT Digital) points to proxy.opendatahub.bz.it, which redirects it to the S3 bucket

### Testing Environment
#### Web frontend
- S3 Bucket to host the static webpage `alpinebits.lp-test`
- URL = https://alpinebits.opendatahub.testingmachine.eu
- The domain (managed by TT Digital) points to proxy.opendatahub.bz.it, which redirects it to the S3 bucket

## External resources
None at the moment.

## Continuous Deployment
See https://jenkins.testingmachine.eu/job/it.bz.opendatahub.alpinebits.landingpage/

- On testing the static web app will be automatically deployed on each push to the development branch
- On production the static web app will be manually deployed from the master branch

## Continous Integration
See https://ci.opendatahub.bz.it/job/it.bz.opendatahub.alpinebits.landingpage/

- The CI pipeline runs on every branch including pull requests and gives feedback to the Github repo

## Repositories
- https://github.com/noi-techpark/it.bz.opendatahub.alpinebits.landingpage
