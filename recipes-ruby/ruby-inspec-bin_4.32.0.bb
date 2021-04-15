SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-inspec"

SRC_URI[md5sum] = "938038f70eb3db8b5d2b778af9645d15"
SRC_URI[sha256sum] = "949acbd636efe4f0d333f352ca8d49755a644fb3d1f8d2da10ab437f387a5bf2"

GEM_NAME = "inspec-bin"

inherit rubygems
