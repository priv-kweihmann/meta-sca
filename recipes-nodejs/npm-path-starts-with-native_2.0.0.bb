SUMMARY = "NPM: path-starts-with"
DESCRIPTION = "Returns true if a filepath starts with the given string. Works with windows and posix/unix paths."
HOMEPAGE = "https://github.com/jonschlinkert/path-starts-with"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=18a78fb7f93b8704f516c151ec95ab6f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/path-starts-with/-/path-starts-with-2.0.0.tgz"
SRC_URI[md5sum] = "e51b1efde5c4e85f562f9b28f9977f51"
SRC_URI[sha256sum] = "3ff8c6dbdbbf159037d95b071790c43c4729c25fb9601cb980adfd594e35898a"

NPM_PKGNAME = "path-starts-with"

inherit npmhelper
inherit native
