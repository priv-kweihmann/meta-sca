SUMMARY = "RubyGem: googleauth"
DESCRIPTION = "Allows simple authorization for accessing Google APIs.   Provide support for Application Default Credentials, as described at   https://developers.google.com/accounts/docs/application-default-credentials"
HOMEPAGE = "https://github.com/googleapis/google-auth-library-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10c2a85445c418fe8265c4ad0963535b"

DEPENDS += ""
RDEPENDS_${PN} += "bash \
                  ruby-faraday \
                  ruby-jwt \
                  ruby-memoist \
                  ruby-multi-json \
                  ruby-os \
                  ruby-signet"

SRC_URI[md5sum] = "499c7579d140e2b7677d6af20e923c70"
SRC_URI[sha256sum] = "89fb8010f81426c1c83183792c2d6f6cf65e3955af2a83115ffe409ca2817581"

GEM_NAME = "googleauth"

inherit rubygems
