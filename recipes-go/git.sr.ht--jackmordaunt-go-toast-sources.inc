SRC_URI += "https://proxy.golang.org/git.sr.ht/~jackmordaunt/go-toast/@v/v1.0.0.zip;srcoutput=git.sr.ht/~jackmordaunt/go-toast;srcinput=git.sr.ht/~jackmordaunt/go-toast@v1.0.0;downloadfilename=git-sr-ht--jackmordaunt-go-toast-1.0.0.zip;name=git-sr-ht--jackmordaunt-go-toast"
SRC_URI[git-sr-ht--jackmordaunt-go-toast.sha256sum] = "af51fbcbffec0ec83b560fc04501e1e487d6087bd060c059ec42ffe4dddd5477"
GOSRC_REMOVEDIRS += "git.sr.ht/~jackmordaunt/go-toast/examples"

GOSRC_LICENSE += "\
    MIT \
    Unlicense \
"
LIC_FILES_CHKSUM += "\
    file://src/git.sr.ht/~jackmordaunt/go-toast/LICENSE;md5=7294364fc2ab13c31741ec43869fe266 \
"

GOSRC_INCLUDEGUARD += "git.sr.ht--jackmordaunt-go-toast-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-ole-go-ole-sources.inc', '', 'github.com-go-ole-go-ole-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
