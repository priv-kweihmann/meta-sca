SUMMARY = "NPM: run-parallel"
DESCRIPTION = "Run an array of functions in parallel"
HOMEPAGE = "https://github.com/feross/run-parallel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = "npm-queue-microtask-native"

SRC_URI = "https://registry.npmjs.org/run-parallel/-/run-parallel-1.2.0.tgz"
SRC_URI[md5sum] = "e383fc0a7d63e95a9d599c6b765851e3"
SRC_URI[sha256sum] = "6ba231f5377e0b18ef7ab0c65ca895708e21f1abff5999b24629436b0ff77ac8"

NPM_PKGNAME = "run-parallel"

inherit npmhelper
inherit native
