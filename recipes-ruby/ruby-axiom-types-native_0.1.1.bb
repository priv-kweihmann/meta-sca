SUMMARY = "Powerful, flexible and configurable coercion library. And nothing more."
HOMEPAGE = "https://github.com/solnic/coercible"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb2f5305df40093372eea3bbf265a14c"

DEPENDS += "\
            ruby-descendants-tracker-native \
            ruby-ice-nine-native \
            ruby-thread-safe-native \
            "

SRC_URI[md5sum] = "728d702cf0f3f31b49b41a4019afba56"
SRC_URI[sha256sum] = "c1ff113f3de516fa195b2db7e0a9a95fd1b08475a502ff660d04507a09980383"

GEM_NAME = "axiom-types"

inherit rubygems
inherit native
