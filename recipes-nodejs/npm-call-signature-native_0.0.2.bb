SUMMARY = "NPM: call-signature"
DESCRIPTION = "Parse / Generate Method Signatures"
HOMEPAGE = "https://github.com/jamestalmage/call-signature#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=289129afe2c8d393c7a535bcdcbddb86"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/call-signature/-/call-signature-0.0.2.tgz"
SRC_URI[md5sum] = "89b1909d657e659cb25151e095e84407"
SRC_URI[sha256sum] = "04295dba64e86fb68e0af8a0d1c780daf69e2ae1fb60b9ee80a83caddec16911"

NPM_PKGNAME = "call-signature"

inherit npmhelper
inherit native
