SUMMARY = "RubyGem: trailblazer-option"
DESCRIPTION = "Wrap an option at compile-time and `call` it at runtime, which allows to have the common `-> ()`, `:method` or `Callable` pattern used for most options."
HOMEPAGE = "https://trailblazer.to/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=246c61a72af89fae27a4339662b56ee8"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "2032acad8005ada6221370df6a128c47"
SRC_URI[sha256sum] = "c7d40fa508f2ff5a8a4b9d67d08a6e6dda99bbf9ba7cbf3b67cd8752537a6abb"

GEM_NAME = "trailblazer-option"

inherit rubygems
