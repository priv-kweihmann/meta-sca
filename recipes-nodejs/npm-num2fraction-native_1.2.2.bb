SUMMARY = "NPM: num2fraction"
DESCRIPTION = "Convert number to fraction"
HOMEPAGE = "https://github.com/yisibl/num2fraction#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=07a595e11744cd2f842e634fbcafcfe2"

SRC_URI = "https://registry.npmjs.org/num2fraction/-/num2fraction-1.2.2.tgz"
SRC_URI[md5sum] = "f9e16d082f43183175d885c6da2c193c"
SRC_URI[sha256sum] = "0225f46ed6c6fb9538c6219dc953b7aa4e74a4b6d2c92ebd58d07be3e8388133"

NPM_PKGNAME = "num2fraction"

inherit npmhelper
inherit native
