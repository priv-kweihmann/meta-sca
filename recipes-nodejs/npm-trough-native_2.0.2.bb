SUMMARY = "NPM: trough"
DESCRIPTION = "Middleware: a channel used to convey a liquid"
HOMEPAGE = "https://github.com/wooorm/trough#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=b280acbcf1c2e5ef4ceb6852568d9961"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trough/-/trough-2.0.2.tgz"
SRC_URI[md5sum] = "aee71aeba0e7b4c3c57bd2cf268b70e8"
SRC_URI[sha256sum] = "a25368fe7fe28be35a8ff0d134dd9c847a5ea60419f93f94bd187d1f489ec7ea"

NPM_PKGNAME = "trough"

inherit npmhelper
inherit native
