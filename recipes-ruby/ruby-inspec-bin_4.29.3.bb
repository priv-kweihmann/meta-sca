SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "227728a524049bd3d8637e2e36f56e74"
SRC_URI[sha256sum] = "6dd81ca95eedd023dddfd9dcb6ee2278af82a8d650433df5271c86cba09d7de3"

GEM_NAME = "inspec-bin"

inherit rubygems
