SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "ba91978be93e4b5da0ba1aaf1cbac16a"
SRC_URI[sha256sum] = "6712967660c9ffda17a526210182d0ed9ef079d45b3aafe009f91a8c71b8cfe3"

GEM_NAME = "inspec-bin"

inherit rubygems
