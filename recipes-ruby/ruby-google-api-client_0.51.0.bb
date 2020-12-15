SUMMARY = "RubyGem: google-api-client"
DESCRIPTION = "Client for accessing Google APIs"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f124bfaefacd4e1a4080065d403bc1d4"

DEPENDS = ""
RDEPENDS_${PN} += "bash \
                  ruby-addressable \
                  ruby-googleauth \
                  ruby-httpclient \
                  ruby-mini-mime \
                  ruby-representable \
                  ruby-retriable \
                  ruby-rexml \
                  ruby-signet"

SRC_URI[md5sum] = "9682b0e228c0c6774c7f8f780e19e654"
SRC_URI[sha256sum] = "f70c675c26ab9c6149305b4fe627d2f6d88324c6f95c8e473e7fe61b9ab21774"

GEM_NAME = "google-api-client"

inherit rubygems
