SUMMARY = "RubyGem: google-api-client"
DESCRIPTION = "Client for accessing Google APIs"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f124bfaefacd4e1a4080065d403bc1d4"

DEPENDS += ""
RDEPENDS_${PN} += "bash \
                  ruby-addressable \
                  ruby-google-apis-core \
                  ruby-google-apis-generator \
                  ruby-googleauth \
                  ruby-httpclient \
                  ruby-mini-mime \
                  ruby-representable \
                  ruby-retriable \
                  ruby-rexml \
                  ruby-signet"

SRC_URI[md5sum] = "1b303920fe3bab13fd08331a3f1514fd"
SRC_URI[sha256sum] = "41006ef21fe02a70cff39a10aebf84fa7fb5f24c63566ab12b149ff1f1d9d7ff"

GEM_NAME = "google-api-client"

inherit rubygems
