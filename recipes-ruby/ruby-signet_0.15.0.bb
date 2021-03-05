SUMMARY = "RubyGem: signet"
DESCRIPTION = "Signet is an OAuth 1.0 / OAuth 2.0 implementation."
HOMEPAGE = "https://github.com/googleapis/signet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f124bfaefacd4e1a4080065d403bc1d4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-faraday \
                  ruby-jwt \
                  ruby-multi-json"

SRC_URI[md5sum] = "e51923e16752e1d362573aebe9a75d74"
SRC_URI[sha256sum] = "0f184cb36951f56de355a4cf6357a77e2a78a240ac63a47b19b7c399aaab7def"

GEM_NAME = "signet"

inherit rubygems
