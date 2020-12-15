SUMMARY = "RubyGem: pry"
DESCRIPTION = "Pry is a runtime developer console and IRB alternative with powerfulintrospection capabilities"
HOMEPAGE = "http://pry.github.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=36c4b1806b2aadea5cbee4bbbdeb341c"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-coderay \
                  ruby-method-source"

SRC_URI[md5sum] = "058455b470d75af017c6df5ec03f519a"
SRC_URI[sha256sum] = "1393918c415af46b6d09044d2b78dde92b29bc834fd85c369a950bab0826dc47"

GEM_NAME = "pry"

inherit rubygems
