do_install:append:class-native() {
    # replace hardcoded shebang with
    sed -i '1 s|^.*$|#!/usr/bin/env perl|' ${D}${bindir}/config_data
}