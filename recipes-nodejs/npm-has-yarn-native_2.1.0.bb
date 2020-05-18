SUMMARY = "NPM: has-yarn"
DESCRIPTION = "Check if a project is using Yarn"
HOMEPAGE = "https://github.com/sindresorhus/has-yarn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-yarn/-/has-yarn-2.1.0.tgz"
SRC_URI[md5sum] = "7d238a884da9148f4d45278858f51bea"
SRC_URI[sha256sum] = "d46527940617b9778ea549552d7950f881ed1f9ac16c49f386f6acb97517869a"

NPM_PKGNAME = "has-yarn"

inherit npmhelper
inherit native
