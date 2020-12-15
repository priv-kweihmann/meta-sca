SUMMARY = "RubyGem: googleauth"
DESCRIPTION = "Allows simple authorization for accessing Google APIs.   Provide support for Application Default Credentials, as described at   https://developers.google.com/accounts/docs/application-default-credentials"
HOMEPAGE = "https://github.com/googleapis/google-auth-library-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10c2a85445c418fe8265c4ad0963535b"

DEPENDS = ""
RDEPENDS_${PN} += "bash \
                  ruby-faraday \
                  ruby-jwt \
                  ruby-memoist \
                  ruby-multi-json \
                  ruby-os \
                  ruby-signet"

SRC_URI[md5sum] = "82136599846f514e003e90272e9961c6"
SRC_URI[sha256sum] = "4659b563d5b2727e775ba9231e75485c1b55ac8fc319e0bf1bc87d5e9705a632"

GEM_NAME = "googleauth"

inherit rubygems
