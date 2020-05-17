SUMMARY = "NPM: process-nextick-args"
DESCRIPTION = "process.nextTick but always with args"
HOMEPAGE = "https://github.com/calvinmetcalf/process-nextick-args"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=216769dac98a78ec088ee7cc6fad1dfa"

SRC_URI = "https://registry.npmjs.org/process-nextick-args/-/process-nextick-args-2.0.1.tgz"
SRC_URI[md5sum] = "09e1b13837638717ed3f2aae7bc700db"
SRC_URI[sha256sum] = "425bf8c725d23bc5ac76bcedd10d9cdbbd6354c7273dd7def44417cfbca8889b"

NPM_PKGNAME = "process-nextick-args"

inherit npmhelper
inherit native
