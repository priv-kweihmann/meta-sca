SUMMARY = "NPM: prelude-ls"
DESCRIPTION = "prelude.ls is a functionally oriented utility library. It is powerful and flexible. Almost all of its functions are curried. It is written in, and is the recommended base library for, LiveScript."
HOMEPAGE = "http://preludels.com"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7733af876e78a187f3a51e7c276ae883"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/prelude-ls/-/prelude-ls-1.2.1.tgz"
SRC_URI[md5sum] = "06b4d4e8d420c50fd8cb025d614d97fc"
SRC_URI[sha256sum] = "14e8fc397f1f852ffda5bed29d012605add8866feff1790b388ad8f7abb8d291"

NPM_PKGNAME = "prelude-ls"

inherit npmhelper
inherit native
