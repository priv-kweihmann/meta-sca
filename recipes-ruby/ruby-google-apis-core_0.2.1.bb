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

SRC_URI[md5sum] = "ba38eed85bb6529bf621f745723d69bf"
SRC_URI[sha256sum] = "4efc94daaf4b73f98a746d83823b28e6a3bbbb390ec957726015e9f30fc797a0"

GEM_NAME = "google-apis-core"

inherit rubygems
