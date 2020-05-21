SUMMARY = "NPM: path-starts-with"
DESCRIPTION = "Returns true if a filepath starts with the given string. Works with windows and posix/unix paths."
HOMEPAGE = "https://github.com/jonschlinkert/path-starts-with"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=18a78fb7f93b8704f516c151ec95ab6f"

DEPENDS = "npm-normalize-path-native"

SRC_URI = "https://registry.npmjs.org/path-starts-with/-/path-starts-with-1.0.0.tgz"
SRC_URI[md5sum] = "d1d0b845c492349d43ccee48955591f2"
SRC_URI[sha256sum] = "507b4f84836ca42f5668cd19feb7694afd514ad7040a4a41940bcd9ea55bcbf2"

NPM_PKGNAME = "path-starts-with"

inherit npmhelper
inherit native
