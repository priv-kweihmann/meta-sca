DEBFILE = "shellcheck_${PV}_amd64.deb"
SRC_URI = "http://ftp.debian.org/debian/pool/main/s/shellcheck/${DEBFILE}"
SRC_URI[md5sum] = "ae624e4cc6713b65c0fdefb0307af668"
SRC_URI[sha256sum] = "0c233abe0ca334fec397c668f4d7fe14482ac7ecb13b3e6cbd509b758d91116f"

UPSTREAM_CHECK_REGEX = "shellcheck_(?P<pver>[\d\+\-_a-z\.]+)_amd64.deb"
