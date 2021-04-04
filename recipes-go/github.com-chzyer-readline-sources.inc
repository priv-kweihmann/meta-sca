SRC_URI += "https://proxy.golang.org/github.com/chzyer/readline/@v/v0.0.0-20180603132655-2972be24d48e.zip;srcoutput=github.com/chzyer/readline;srcinput=github.com/chzyer/readline@v0.0.0-20180603132655-2972be24d48e;downloadfilename=github-com-chzyer-readline-0.0.0-20180603132655-2972be24d48e.zip;name=github-com-chzyer-readline"
SRC_URI[github-com-chzyer-readline.sha256sum] = "3dc842677887278fb33d25078d375ae6a7a94bb77a8d205ee2230b581b6947a6"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/chzyer/readline/LICENSE;md5=418537a9de727a6f4cf2461b08e5e7e7 \
"

GOSRC_INCLUDEGUARD += "github.com-chzyer-readline-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nbutton23-zxcvbn-go-sources.inc', '', 'github.com-nbutton23-zxcvbn-go-sources.inc', d)}
