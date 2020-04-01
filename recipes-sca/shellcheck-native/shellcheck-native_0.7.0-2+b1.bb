## Include arch depending sources
require ${@'shellcheck-native_arch_%s.inc' % d.getVar('BUILD_ARCH')}

require shellcheck-native_helper.inc

require shellcheck-native.inc
