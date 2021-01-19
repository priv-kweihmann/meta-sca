SUMMARY = "RubyGem: google-apis-core"
DESCRIPTION = "Common utility and base classes for legacy Google REST clients"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-googleauth \
                  ruby-httpclient \
                  ruby-mini-mime \
                  ruby-representable \
                  ruby-retriable \
                  ruby-rexml \
                  ruby-signet"

SRC_URI[md5sum] = "a6dc2f3eab5efeea75ad1004c4e23e52"
SRC_URI[sha256sum] = "286b3f1f93846688736645745f816168c2e9c7ee7788a97ddacd4538ab425aaf"

GEM_NAME = "google-apis-core"

inherit rubygems
