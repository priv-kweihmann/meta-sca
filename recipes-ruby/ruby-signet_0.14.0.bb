SUMMARY = "RubyGem: signet"
DESCRIPTION = "Signet is an OAuth 1.0 / OAuth 2.0 implementation."
HOMEPAGE = "https://github.com/googleapis/signet"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f124bfaefacd4e1a4080065d403bc1d4"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-addressable \
                  ruby-faraday \
                  ruby-jwt \
                  ruby-multi-json"

SRC_URI[md5sum] = "4af653837cec1813e4e04d96dfffc83e"
SRC_URI[sha256sum] = "17dfcaaf40df57eeb7fcc78e3759b64722b7f4e35e85c62028ccf6ed8e31e281"

GEM_NAME = "signet"

inherit rubygems
