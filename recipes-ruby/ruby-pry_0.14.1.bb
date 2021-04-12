SUMMARY = "RubyGem: pry"
DESCRIPTION = "Pry is a runtime developer console and IRB alternative with powerfulintrospection capabilities"
HOMEPAGE = "http://pry.github.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=36c4b1806b2aadea5cbee4bbbdeb341c"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-coderay \
                  ruby-method-source"

SRC_URI[md5sum] = "c329302a76b316033e16d27ba872d208"
SRC_URI[sha256sum] = "99b6df0665875dd5a39d85e0150aa5a12e2bb4fef401b6c4f64d32ee502f8454"

GEM_NAME = "pry"

inherit rubygems
