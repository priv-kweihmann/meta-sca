SUMMARY = "NPM: cspell-dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/elixir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acfbf4bfa9578f50e7ce529644121342"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-elixir/-/cspell-dict-elixir-1.0.22.tgz"
SRC_URI[md5sum] = "11d13306f3c28548307d5da9983cce22"
SRC_URI[sha256sum] = "d83aa686232863b9961814a008b49d9ef67d3c5f578dbe1b8e8c9ec8c7dcfa1d"

NPM_PKGNAME = "cspell-dict-elixir"

inherit npmhelper
inherit native
