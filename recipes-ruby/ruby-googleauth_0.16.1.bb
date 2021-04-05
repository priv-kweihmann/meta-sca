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

SRC_URI[md5sum] = "f5e3322c8b83d594506b3e92895ce43b"
SRC_URI[sha256sum] = "566a17835f4c412f21bc57a79f32451e84152446d11e6cdc6b9958d221556890"

GEM_NAME = "googleauth"

inherit rubygems
