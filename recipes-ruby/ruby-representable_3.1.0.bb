SUMMARY = "RubyGem: representable"
DESCRIPTION = "Renders and parses JSON/XML/YAML documents from and to Ruby objects"
HOMEPAGE = "https://github.com/trailblazer/representable/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05037c2d4aa35dcc8c2db40a1b0e6a14"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-declarative \
                  ruby-declarative-option \
                  ruby-trailblazer-option \
                  ruby-uber"

SRC_URI[md5sum] = "0d08bab7319dd811d43a91b812714da0"
SRC_URI[sha256sum] = "70c0df90d7c2bef77db1b7e0ff0280828a44a14c234f0dc60ce2fa7e12da27d3"

GEM_NAME = "representable"

inherit rubygems
