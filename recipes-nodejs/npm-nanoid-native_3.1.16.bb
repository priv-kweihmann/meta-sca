SUMMARY = "NPM: nanoid"
DESCRIPTION = "A tiny (108 bytes), secure URL-friendly unique string ID generator"
HOMEPAGE = "https://github.com/ai/nanoid#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=237c21016e56a1ee4475a39fc00d1504"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nanoid/-/nanoid-3.1.16.tgz"
SRC_URI[md5sum] = "8400990a0d1b07a659d81b4834e058d4"
SRC_URI[sha256sum] = "def57ef8ab79bb36d44cb0f84d6abe77feacbb0641f1858c60b6ca45887558de"

NPM_PKGNAME = "nanoid"

inherit npmhelper
inherit native
