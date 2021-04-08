SUMMARY = "RubyGem: ffi-yajl"
DESCRIPTION = "Ruby FFI wrapper around YAJL 2.x"
HOMEPAGE = "http://github.com/chef/ffi-yajl"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84928ddb161eab99f094cbe0c187e855"

DEPENDS += "ruby-libyajl2 \
                  ruby-libyajl2-native \
                  yajl"
RDEPENDS_${PN} += "ruby-libyajl2"

SRC_URI[md5sum] = "60eec3de8305490fb0e72609a4c2e90a"
SRC_URI[sha256sum] = "ff47586b93280aa6dd4d9a9097337219f641f829b6d56b709339eda1697a5e78"

GEM_NAME = "ffi-yajl"

inherit rubygems

INSANE_SKIP_${PN} += "ldflags"
