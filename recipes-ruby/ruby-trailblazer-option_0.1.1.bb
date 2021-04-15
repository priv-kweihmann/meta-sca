SUMMARY = "RubyGem: trailblazer-option"
DESCRIPTION = "Wrap an option at compile-time and `call` it at runtime, which allows to have the common `-> ()`, `:method` or `Callable` pattern used for most options."
HOMEPAGE = "https://trailblazer.to/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=246c61a72af89fae27a4339662b56ee8"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "c649c7ef2238155de5eb58ed5041e534"
SRC_URI[sha256sum] = "59c59c76d20e091f898509ad4f9c7c0017b5bea256b91cd73fa6818372caba79"

GEM_NAME = "trailblazer-option"

inherit rubygems
