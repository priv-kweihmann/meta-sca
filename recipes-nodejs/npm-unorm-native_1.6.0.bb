SUMMARY = "NPM: unorm"
DESCRIPTION = "JavaScript Unicode 8.0 Normalization - NFC, NFD, NFKC, NFKD. Read <http://unicode.org/reports/tr15/> UAX #15 Unicode Normalization Forms."
HOMEPAGE = "https://github.com/walling/unorm#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9802a4c3223160109d146f4bbeda01a5"

SRC_URI = "https://registry.npmjs.org/unorm/-/unorm-1.6.0.tgz"
SRC_URI[md5sum] = "c12ba6ab8a3b75e7e917ee8148e65e9c"
SRC_URI[sha256sum] = "91bae31bfce430882ccb583322ed4ab75b94deac6b32efa1248d548e0a1bf5a6"

NPM_PKGNAME = "unorm"

inherit npmhelper
inherit native
