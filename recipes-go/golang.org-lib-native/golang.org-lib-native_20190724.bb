SUMMARY = "Go supplementary libraries"
HOMEPAGE = "https://github.com/golang"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "\
                    file://src/${GO_IMPORT}/crypto/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://src/${GO_IMPORT}/lint/LICENSE;md5=4c728948788b1a02f33ae4e906546eef \
                    file://src/${GO_IMPORT}/mod/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://src/${GO_IMPORT}/net/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://src/${GO_IMPORT}/sync/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://src/${GO_IMPORT}/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://src/${GO_IMPORT}/term/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://src/${GO_IMPORT}/text/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://src/${GO_IMPORT}/tools/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
                    file://src/${GO_IMPORT}/xerrors/LICENSE;md5=a413d6b3884e141783f23d00d5838777 \
                   "

PROVIDES += "golang.org-x-xerrors-native"
PROVIDES += "golang.org-x-tools-native"
PROVIDES += "golang.org-x-text-native"
PROVIDES += "golang.org-x-term-native"
PROVIDES += "golang.org-x-sys-native"
PROVIDES += "golang.org-x-sync-native"
PROVIDES += "golang.org-x-net-native"
PROVIDES += "golang.org-x-mod-native"
PROVIDES += "golang.org-x-lint-native"
PROVIDES += "golang.org-x-crypto-native"

SRC_URI = "\
           git://github.com/golang/xerrors.git;protocol=https;name=xerrors;destsuffix=git/src/golang.org/x/xerrors \
           git://github.com/golang/tools.git;protocol=https;name=tools;destsuffix=git/src/golang.org/x/tools \
           git://github.com/golang/text.git;protocol=https;name=text;destsuffix=git/src/golang.org/x/text \
           git://github.com/golang/term.git;protocol=https;name=term;destsuffix=git/src/golang.org/x/term \
           git://github.com/golang/sys.git;protocol=https;name=sys;destsuffix=git/src/golang.org/x/sys \
           git://github.com/golang/sync.git;protocol=https;name=sync;destsuffix=git/src/golang.org/x/sync \
           git://github.com/golang/net.git;protocol=https;name=net;destsuffix=git/src/golang.org/x/net \
           git://github.com/golang/mod.git;protocol=https;name=mod;destsuffix=git/src/golang.org/x/mod \
           git://github.com/golang/lint.git;protocol=https;name=lint;destsuffix=git/src/golang.org/x/lint \
           git://github.com/golang/crypto.git;protocol=https;name=crypto;destsuffix=git/src/golang.org/x/crypto \
          "

SRCREV_crypto = "4def268fd1a49955bfb3dda92fe3db4f924f2285"
SRCREV_lint = "959b441ac422379a43da2230f62be024250818b0"
SRCREV_mod = "d8296639b499981d50d327e4b5714c5734e925d6"
SRCREV_net = "ca1201d0de80cfde86cb01aea620983605dfe99b"
SRCREV_sync = "112230192c580c3556b8cee6403af37a4fc5f28c"
SRCREV_sys = "fae7ac547cb717d141c433a2a173315e216b64c4"
SRCREV_term = "ad39bd3f040707b5df30c27c61adbb34be928cd9"
SRCREV_text = "342b2e1fbaa52c93f31447ad2c6abc048c63e475"
SRCREV_tools = "8bb11ff117ca820938b6d899b13b3f2832ef244c"
SRCREV_xerrors = "9bdfabe68543c54f90421aeb9a60ef8061b5b544"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "golang.org/x"

inherit go
inherit native

do_install_append() {
    # Remove /usr/bin/bundle as it otherwise collides with ruby
    rm -rf ${D}${bindir}/bundle
}
