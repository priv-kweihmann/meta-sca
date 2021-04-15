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

SRC_URI[md5sum] = "5e3fb8dd379540b518d8aeba16f93a7b"
SRC_URI[sha256sum] = "dacfd01d46ee2c398cf78aa74a3269dd52adc38fdae32c3d3fe5fa4cd2ffbc27"

GEM_NAME = "representable"

inherit rubygems
