DEBFILE = "shellcheck_${PV}_armhf.deb"
SRC_URI = "http://ftp.debian.org/debian/pool/main/s/shellcheck/${DEBFILE}"
SRC_URI[md5sum] = "d28b41d005d55a0d316e1888a2b28326"
SRC_URI[sha256sum] = "f70b41832155707960ee5d73b6b8dc1f310c5b88e06193696ef06fefc9f3329d"

UPSTREAM_CHECK_REGEX = "shellcheck_(?P<pver>[\d\+\-_a-z\.]+)_armhf.deb"
