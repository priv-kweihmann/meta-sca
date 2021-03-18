SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "a516afc89a0886b9a42f5006d5f687ca"
SRC_URI[sha256sum] = "98b0f259ab8afae236f547a78cd5b66bf66394bb6e49548c15b82ce61e3dfe47"

GEM_NAME = "inspec-bin"

inherit rubygems
