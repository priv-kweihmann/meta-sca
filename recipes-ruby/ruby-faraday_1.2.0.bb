SUMMARY = "RubyGem: faraday"
DESCRIPTION = "HTTP/REST API client library."
HOMEPAGE = "https://lostisland.github.io/faraday"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=eeb478a3bdc6cd7919e354aeb42b94e4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-multipart-post \
                  ruby-ruby2-keywords"

SRC_URI[md5sum] = "7af6588221f13ef95334b5f725d55d7d"
SRC_URI[sha256sum] = "bd5c138304ee53907f8d0747724660c3a1cdf77d530d1cecd70d141299194b99"

GEM_NAME = "faraday"

inherit rubygems
