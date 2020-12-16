SUMMARY = "RubyGem: google-api-client"
DESCRIPTION = "Client for accessing Google APIs"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f124bfaefacd4e1a4080065d403bc1d4"

DEPENDS += ""
RDEPENDS_${PN} += "bash\
                  ruby-addressable \
                  ruby-googleauth \
                  ruby-httpclient \
                  ruby-mini-mime \
                  ruby-representable \
                  ruby-retriable \
                  ruby-rexml \
                  ruby-signet"

SRC_URI[md5sum] = "4f2fec9592929d87614adc980f42e43e"
SRC_URI[sha256sum] = "6b0c0add28e8bb057451760168fac5602cd3319201647dc439ce6de7bdd734e0"

GEM_NAME = "google-api-client"

inherit rubygems
