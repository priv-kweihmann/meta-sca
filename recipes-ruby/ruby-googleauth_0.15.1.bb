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

SRC_URI[md5sum] = "a7881156f24f8fb91b49c944ea9e7aa7"
SRC_URI[sha256sum] = "3f99061b6bc5af7345eceef242f32572c1199b24fa350c9024fc3ed41e76eb51"

GEM_NAME = "googleauth"

inherit rubygems
