SUMMARY = "NPM: create-error-class"
DESCRIPTION = "Create Error classes"
HOMEPAGE = "https://github.com/floatdrop/create-error-class"

DEPENDS = "npm-capture-stack-trace-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=be72c3ad86c1c4e9578a1945b082b17d"

SRC_URI = "https://registry.npmjs.org/create-error-class/-/create-error-class-3.0.2.tgz"
SRC_URI[md5sum] = "25770c2b93d770fd6fe9ef118fe1bbd0"
SRC_URI[sha256sum] = "58b4f9ded51f68f16b306a4b930eb1ca111eded9798632ab477e23f205e1c141"

NPM_PKGNAME = "create-error-class"

inherit npmhelper
inherit native
