SUMMARY = "NPM: reserved-words"
DESCRIPTION = "ECMAScript reserved words checker"
HOMEPAGE = "https://github.com/zxqfox/reserved-words#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3939872d9520d99a98196ca7661798f5"

SRC_URI = "https://registry.npmjs.org/reserved-words/-/reserved-words-0.1.2.tgz"
SRC_URI[md5sum] = "5cc543708058cd724eb872cab3967fb6"
SRC_URI[sha256sum] = "4c5cef03ac0d2f5d642de7dcf816ed953585ccfa6b1e1f9715ebfaed05c486fb"

NPM_PKGNAME = "reserved-words"

inherit npmhelper
inherit native
