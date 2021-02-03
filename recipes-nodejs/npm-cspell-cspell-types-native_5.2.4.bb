SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.2.4.tgz"
SRC_URI[md5sum] = "1407f7dee1566f4cb351f0f6f8611b5e"
SRC_URI[sha256sum] = "ca3a46ad25799decaeb1135fc254e1a27193c82c0e3a59e3708a675c5714bf0d"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
