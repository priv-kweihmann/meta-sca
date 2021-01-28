SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "fc731fff30ddcd0b8e5403bff573e8c4"
SRC_URI[sha256sum] = "21ef659fa8e48ccdce1140938bec00affc7bb6d8fe9ea937c73153114a8af471"

GEM_NAME = "inspec-bin"

inherit rubygems
