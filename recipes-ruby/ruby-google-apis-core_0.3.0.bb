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
                  ruby-signet \
                  ruby-webrick"

SRC_URI[md5sum] = "386faccbb3941397db176406edacd9bb"
SRC_URI[sha256sum] = "4a04e1daa6397781e5ef289e9dcb9274fbb2d8018ea47869bfa875e97c94a4cb"

GEM_NAME = "google-apis-core"

inherit rubygems
