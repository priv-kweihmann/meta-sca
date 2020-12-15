SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "fadb05bec8b36dd3914edd8ab6089ac1"
SRC_URI[sha256sum] = "34e42fb37fff0526f3c0b55e4cf5707dd3deb68adc95043c8eed9553f66632c3"

GEM_NAME = "inspec-bin"

inherit rubygems
