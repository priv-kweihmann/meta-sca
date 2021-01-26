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

SRC_URI[md5sum] = "5a6670e2854ec4644e629b3992bfdc54"
SRC_URI[sha256sum] = "5fb019c14fb02ff0c8d61b1d6714952663247db06313eecd84cefdb27e0595df"

GEM_NAME = "googleauth"

inherit rubygems
