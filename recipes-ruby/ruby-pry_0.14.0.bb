SUMMARY = "RubyGem: pry"
DESCRIPTION = "Pry is a runtime developer console and IRB alternative with powerfulintrospection capabilities"
HOMEPAGE = "http://pry.github.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=36c4b1806b2aadea5cbee4bbbdeb341c"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-coderay \
                  ruby-method-source"

SRC_URI[md5sum] = "a9670cf49b2d9e70930f59562c46cbea"
SRC_URI[sha256sum] = "3b5e50b6b5e114218d7a103f6b37afbc24da62a61ad17b79a0899dd7dc1e18ea"

GEM_NAME = "pry"

inherit rubygems
