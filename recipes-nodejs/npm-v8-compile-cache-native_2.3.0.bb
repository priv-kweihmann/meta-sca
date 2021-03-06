SUMMARY = "NPM: v8-compile-cache"
DESCRIPTION = "Require hook for automatic V8 compile cache persistence"
HOMEPAGE = "https://github.com/zertosh/v8-compile-cache#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dfd25c36f69a5eb33bd7338e42a726c8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/v8-compile-cache/-/v8-compile-cache-2.3.0.tgz"
SRC_URI[md5sum] = "776b66d0ccba6076f75f29d0f4c54472"
SRC_URI[sha256sum] = "927e6cc2f3caf5144d53182fec52989866d774271612fe95529f7e5ef98f913f"

NPM_PKGNAME = "v8-compile-cache"

inherit npmhelper
inherit native
