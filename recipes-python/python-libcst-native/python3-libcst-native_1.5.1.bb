SUMMARY = "A concrete syntax tree with AST-like properties"
HOMEPAGE = "https://github.com/Instagram/LibCST"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=bb0bb1a5e064e5019d855a2d28147544 \
    file://native/libcst/LICENSE;md5=bb0bb1a5e064e5019d855a2d28147544 \
    file://native/libcst/src/tokenizer/core/LICENSE;md5=baa042022c799cfd984b3354c4c1ccc1 \
    file://native/libcst_derive/LICENSE;md5=bb0bb1a5e064e5019d855a2d28147544 \
"

DEPENDS += "python3-pyyaml-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

CRATES_LIST = "\
    crate://crates.io/aho-corasick/1.0.4 \
    crate://crates.io/anes/0.1.6 \
    crate://crates.io/annotate-snippets/0.6.1 \
    crate://crates.io/anstyle/1.0.2 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.4.0 \
    crate://crates.io/bumpalo/3.12.0 \
    crate://crates.io/cast/0.3.0 \
    crate://crates.io/cc/1.0.83 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chic/1.2.2 \
    crate://crates.io/ciborium-io/0.2.0 \
    crate://crates.io/ciborium-ll/0.2.0 \
    crate://crates.io/ciborium/0.2.0 \
    crate://crates.io/clap/4.4.0 \
    crate://crates.io/clap_builder/4.4.0 \
    crate://crates.io/clap_lex/0.5.1 \
    crate://crates.io/criterion-plot/0.5.0 \
    crate://crates.io/criterion/0.5.1 \
    crate://crates.io/crossbeam-deque/0.8.1 \
    crate://crates.io/crossbeam-epoch/0.9.9 \
    crate://crates.io/crossbeam-utils/0.8.10 \
    crate://crates.io/difference/2.0.0 \
    crate://crates.io/either/1.6.1 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.2 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/half/1.8.2 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.3.2 \
    crate://crates.io/indexmap/2.4.0 \
    crate://crates.io/indoc/2.0.4 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/is-terminal/0.4.9 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itertools/0.13.0 \
    crate://crates.io/itoa/1.0.2 \
    crate://crates.io/js-sys/0.3.58 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.149 \
    crate://crates.io/linux-raw-sys/0.4.10 \
    crate://crates.io/lock_api/0.4.7 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/memoffset/0.9.0 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/once_cell/1.16.0 \
    crate://crates.io/oorandom/11.1.3 \
    crate://crates.io/parking_lot/0.11.2 \
    crate://crates.io/parking_lot_core/0.8.5 \
    crate://crates.io/paste/1.0.15 \
    crate://crates.io/peg-macros/0.8.4 \
    crate://crates.io/peg-runtime/0.8.3 \
    crate://crates.io/peg/0.8.4 \
    crate://crates.io/plotters-backend/0.3.2 \
    crate://crates.io/plotters-svg/0.3.1 \
    crate://crates.io/plotters/0.3.1 \
    crate://crates.io/proc-macro2/1.0.86 \
    crate://crates.io/pyo3-build-config/0.20.2 \
    crate://crates.io/pyo3-ffi/0.20.2 \
    crate://crates.io/pyo3-macros-backend/0.20.2 \
    crate://crates.io/pyo3-macros/0.20.2 \
    crate://crates.io/pyo3/0.20.2 \
    crate://crates.io/quote/1.0.37 \
    crate://crates.io/rayon-core/1.12.1 \
    crate://crates.io/rayon/1.10.0 \
    crate://crates.io/redox_syscall/0.2.13 \
    crate://crates.io/regex-automata/0.4.7 \
    crate://crates.io/regex-syntax/0.8.4 \
    crate://crates.io/regex/1.10.6 \
    crate://crates.io/rustix/0.38.19 \
    crate://crates.io/ryu/1.0.10 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/serde/1.0.208 \
    crate://crates.io/serde_derive/1.0.208 \
    crate://crates.io/serde_json/1.0.125 \
    crate://crates.io/serde_spanned/0.6.7 \
    crate://crates.io/smallvec/1.8.1 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.75 \
    crate://crates.io/target-lexicon/0.12.4 \
    crate://crates.io/termcolor/1.1.3 \
    crate://crates.io/thiserror-impl/1.0.63 \
    crate://crates.io/thiserror/1.0.63 \
    crate://crates.io/tinytemplate/1.2.1 \
    crate://crates.io/toml/0.8.19 \
    crate://crates.io/toml_datetime/0.6.8 \
    crate://crates.io/toml_edit/0.22.20 \
    crate://crates.io/trybuild/1.0.99 \
    crate://crates.io/unicode-ident/1.0.1 \
    crate://crates.io/unindent/0.2.3 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/wasm-bindgen-backend/0.2.81 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.81 \
    crate://crates.io/wasm-bindgen-macro/0.2.81 \
    crate://crates.io/wasm-bindgen-shared/0.2.81 \
    crate://crates.io/wasm-bindgen/0.2.81 \
    crate://crates.io/web-sys/0.3.58 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/winnow/0.6.18 \
"

SRC_URI[sha256sum] = "71cb294db84df9e410208009c732628e920111683c2f2b2e0c5b71b98464f365"

SRC_URI[aho-corasick-1.0.4.sha256sum] = "6748e8def348ed4d14996fa801f4122cd763fff530258cdc03f64b25f89d3a5a"
SRC_URI[anes-0.1.6.sha256sum] = "4b46cbb362ab8752921c97e041f5e366ee6297bd428a31275b9fcf1e380f7299"
SRC_URI[annotate-snippets-0.6.1.sha256sum] = "c7021ce4924a3f25f802b2cccd1af585e39ea1a363a1aa2e72afe54b67a3a7a7"
SRC_URI[anstyle-1.0.2.sha256sum] = "15c4c2c83f81532e5845a733998b6971faca23490340a418e9b72a3ec9de12ea"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitflags-2.4.0.sha256sum] = "b4682ae6287fcf752ecaabbfcc7b6f9b72aa33933dc23a554d853aea8eea8635"
SRC_URI[bumpalo-3.12.0.sha256sum] = "0d261e256854913907f67ed06efbc3338dfe6179796deefc1ff763fc1aee5535"
SRC_URI[cast-0.3.0.sha256sum] = "37b2a672a2cb129a2e41c10b1224bb368f9f37a2b16b612598138befd7b37eb5"
SRC_URI[cc-1.0.83.sha256sum] = "f1174fb0b6ec23863f8b971027804a42614e347eafb0a95bf0b12cdae21fc4d0"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chic-1.2.2.sha256sum] = "a5b5db619f3556839cb2223ae86ff3f9a09da2c5013be42bc9af08c9589bf70c"
SRC_URI[ciborium-0.2.0.sha256sum] = "b0c137568cc60b904a7724001b35ce2630fd00d5d84805fbb608ab89509d788f"
SRC_URI[ciborium-io-0.2.0.sha256sum] = "346de753af073cc87b52b2083a506b38ac176a44cfb05497b622e27be899b369"
SRC_URI[ciborium-ll-0.2.0.sha256sum] = "213030a2b5a4e0c0892b6652260cf6ccac84827b83a85a534e178e3906c4cf1b"
SRC_URI[clap-4.4.0.sha256sum] = "1d5f1946157a96594eb2d2c10eb7ad9a2b27518cb3000209dec700c35df9197d"
SRC_URI[clap_builder-4.4.0.sha256sum] = "78116e32a042dd73c2901f0dc30790d20ff3447f3e3472fad359e8c3d282bcd6"
SRC_URI[clap_lex-0.5.1.sha256sum] = "cd7cc57abe963c6d3b9d8be5b06ba7c8957a930305ca90304f24ef040aa6f961"
SRC_URI[criterion-0.5.1.sha256sum] = "f2b12d017a929603d80db1831cd3a24082f8137ce19c69e6447f54f5fc8d692f"
SRC_URI[criterion-plot-0.5.0.sha256sum] = "6b50826342786a51a89e2da3a28f1c32b06e387201bc2d19791f622c673706b1"
SRC_URI[crossbeam-deque-0.8.1.sha256sum] = "6455c0ca19f0d2fbf751b908d5c55c1f5cbc65e03c4225427254b46890bdde1e"
SRC_URI[crossbeam-epoch-0.9.9.sha256sum] = "07db9d94cbd326813772c968ccd25999e5f8ae22f4f8d1b11effa37ef6ce281d"
SRC_URI[crossbeam-utils-0.8.10.sha256sum] = "7d82ee10ce34d7bc12c2122495e7593a9c41347ecdd64185af4ecf72cb1a7f83"
SRC_URI[difference-2.0.0.sha256sum] = "524cbf6897b527295dff137cec09ecf3a05f4fddffd7dfcd1585403449e74198"
SRC_URI[either-1.6.1.sha256sum] = "e78d4f1cc4ae33bbfc157ed5d5a5ef3bc29227303d595861deb238fcec4e9457"
SRC_URI[equivalent-1.0.1.sha256sum] = "5443807d6dff69373d433ab9ef5378ad8df50ca6298caf15de6e52e24aaf54d5"
SRC_URI[errno-0.3.2.sha256sum] = "6b30f669a7961ef1631673d2766cc92f52d64f7ef354d4fe0ddfd30ed52f0f4f"
SRC_URI[errno-dragonfly-0.1.2.sha256sum] = "aa68f1b12764fab894d2755d2518754e71b4fd80ecfb822714a1206c2aab39bf"
SRC_URI[glob-0.3.0.sha256sum] = "9b919933a397b79c37e33b77bb2aa3dc8eb6e165ad809e58ff75bc7db2e34574"
SRC_URI[half-1.8.2.sha256sum] = "eabb4a44450da02c90444cf74558da904edde8fb4e9035a9a6a4e15445af0bd7"
SRC_URI[hashbrown-0.14.5.sha256sum] = "e5274423e17b7c9fc20b6e7e208532f9b19825d82dfd615708b70edd83df41f1"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[hermit-abi-0.3.2.sha256sum] = "443144c8cdadd93ebf52ddb4056d257f5b52c04d3c804e657d19eb73fc33668b"
SRC_URI[indexmap-2.4.0.sha256sum] = "93ead53efc7ea8ed3cfb0c79fc8023fbb782a5432b52830b6518941cebe6505c"
SRC_URI[indoc-2.0.4.sha256sum] = "1e186cfbae8084e513daff4240b4797e342f988cecda4fb6c939150f96315fd8"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[is-terminal-0.4.9.sha256sum] = "cb0889898416213fab133e1d33a0e5858a48177452750691bde3666d0fdbaf8b"
SRC_URI[itertools-0.10.5.sha256sum] = "b0fd2260e829bddf4cb6ea802289de2f86d6a7a690192fbe91b3f46e0f2c8473"
SRC_URI[itertools-0.13.0.sha256sum] = "413ee7dfc52ee1a4949ceeb7dbc8a33f2d6c088194d9f922fb8318faf1f01186"
SRC_URI[itoa-1.0.2.sha256sum] = "112c678d4050afce233f4f2852bb2eb519230b3cf12f33585275537d7e41578d"
SRC_URI[js-sys-0.3.58.sha256sum] = "c3fac17f7123a73ca62df411b1bf727ccc805daa070338fda671c86dac1bdc27"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[libc-0.2.149.sha256sum] = "a08173bc88b7955d1b3145aa561539096c421ac8debde8cbc3612ec635fee29b"
SRC_URI[linux-raw-sys-0.4.10.sha256sum] = "da2479e8c062e40bf0066ffa0bc823de0a9368974af99c9f6df941d2c231e03f"
SRC_URI[lock_api-0.4.7.sha256sum] = "327fa5b6a6940e4699ec49a9beae1ea4845c6bab9314e4f84ac68742139d8c53"
SRC_URI[log-0.4.17.sha256sum] = "abb12e687cfb44aa40f41fc3978ef76448f9b6038cad6aef4259d3c095a2382e"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[memoffset-0.9.0.sha256sum] = "5a634b1c61a95585bd15607c6ab0c4e5b226e695ff2800ba0cdccddf208c406c"
SRC_URI[num-traits-0.2.15.sha256sum] = "578ede34cf02f8924ab9447f50c28075b4d3e5b269972345e7e0372b38c6cdcd"
SRC_URI[once_cell-1.16.0.sha256sum] = "86f0b0d4bf799edbc74508c1e8bf170ff5f41238e5f8225603ca7caaae2b7860"
SRC_URI[oorandom-11.1.3.sha256sum] = "0ab1bc2a289d34bd04a330323ac98a1b4bc82c9d9fcb1e66b63caa84da26b575"
SRC_URI[parking_lot-0.11.2.sha256sum] = "7d17b78036a60663b797adeaee46f5c9dfebb86948d1255007a1d6be0271ff99"
SRC_URI[parking_lot_core-0.8.5.sha256sum] = "d76e8e1493bcac0d2766c42737f34458f1c8c50c0d23bcb24ea953affb273216"
SRC_URI[paste-1.0.15.sha256sum] = "57c0d7b74b563b49d38dae00a0c37d4d6de9b432382b2892f0574ddcae73fd0a"
SRC_URI[peg-0.8.4.sha256sum] = "295283b02df346d1ef66052a757869b2876ac29a6bb0ac3f5f7cd44aebe40e8f"
SRC_URI[peg-macros-0.8.4.sha256sum] = "bdad6a1d9cf116a059582ce415d5f5566aabcd4008646779dab7fdc2a9a9d426"
SRC_URI[peg-runtime-0.8.3.sha256sum] = "e3aeb8f54c078314c2065ee649a7241f46b9d8e418e1a9581ba0546657d7aa3a"
SRC_URI[plotters-0.3.1.sha256sum] = "32a3fd9ec30b9749ce28cd91f255d569591cdf937fe280c312143e3c4bad6f2a"
SRC_URI[plotters-backend-0.3.2.sha256sum] = "d88417318da0eaf0fdcdb51a0ee6c3bed624333bff8f946733049380be67ac1c"
SRC_URI[plotters-svg-0.3.1.sha256sum] = "521fa9638fa597e1dc53e9412a4f9cefb01187ee1f7413076f9e6749e2885ba9"
SRC_URI[proc-macro2-1.0.86.sha256sum] = "5e719e8df665df0d1c8fbfd238015744736151d4445ec0836b8e628aae103b77"
SRC_URI[pyo3-0.20.2.sha256sum] = "9a89dc7a5850d0e983be1ec2a463a171d20990487c3cfcd68b5363f1ee3d6fe0"
SRC_URI[pyo3-build-config-0.20.2.sha256sum] = "07426f0d8fe5a601f26293f300afd1a7b1ed5e78b2a705870c5f30893c5163be"
SRC_URI[pyo3-ffi-0.20.2.sha256sum] = "dbb7dec17e17766b46bca4f1a4215a85006b4c2ecde122076c562dd058da6cf1"
SRC_URI[pyo3-macros-0.20.2.sha256sum] = "05f738b4e40d50b5711957f142878cfa0f28e054aa0ebdfc3fd137a843f74ed3"
SRC_URI[pyo3-macros-backend-0.20.2.sha256sum] = "0fc910d4851847827daf9d6cdd4a823fbdaab5b8818325c5e97a86da79e8881f"
SRC_URI[quote-1.0.37.sha256sum] = "b5b9d34b8991d19d98081b46eacdd8eb58c6f2b201139f7c5f643cc155a633af"
SRC_URI[rayon-1.10.0.sha256sum] = "b418a60154510ca1a002a752ca9714984e21e4241e804d32555251faf8b78ffa"
SRC_URI[rayon-core-1.12.1.sha256sum] = "1465873a3dfdaa8ae7cb14b4383657caab0b3e8a0aa9ae8e04b044854c8dfce2"
SRC_URI[redox_syscall-0.2.13.sha256sum] = "62f25bc4c7e55e0b0b7a1d43fb893f4fa1361d0abe38b9ce4f323c2adfe6ef42"
SRC_URI[regex-1.10.6.sha256sum] = "4219d74c6b67a3654a9fbebc4b419e22126d13d2f3c4a07ee0cb61ff79a79619"
SRC_URI[regex-automata-0.4.7.sha256sum] = "38caf58cc5ef2fed281f89292ef23f6365465ed9a41b7a7754eb4e26496c92df"
SRC_URI[regex-syntax-0.8.4.sha256sum] = "7a66a03ae7c801facd77a29370b4faec201768915ac14a721ba36f20bc9c209b"
SRC_URI[rustix-0.38.19.sha256sum] = "745ecfa778e66b2b63c88a61cb36e0eea109e803b0b86bf9879fbc77c70e86ed"
SRC_URI[ryu-1.0.10.sha256sum] = "f3f6f92acf49d1b98f7a81226834412ada05458b7364277387724a237f062695"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[scopeguard-1.1.0.sha256sum] = "d29ab0c6d3fc0ee92fe66e2d99f700eab17a8d57d1c1d3b748380fb20baa78cd"
SRC_URI[serde-1.0.208.sha256sum] = "cff085d2cb684faa248efb494c39b68e522822ac0de72ccf08109abde717cfb2"
SRC_URI[serde_derive-1.0.208.sha256sum] = "24008e81ff7613ed8e5ba0cfaf24e2c2f1e5b8a0495711e44fcd4882fca62bcf"
SRC_URI[serde_json-1.0.125.sha256sum] = "83c8e735a073ccf5be70aa8066aa984eaf2fa000db6c8d0100ae605b366d31ed"
SRC_URI[serde_spanned-0.6.7.sha256sum] = "eb5b1b31579f3811bf615c144393417496f152e12ac8b7663bf664f4a815306d"
SRC_URI[smallvec-1.8.1.sha256sum] = "cc88c725d61fc6c3132893370cac4a0200e3fedf5da8331c570664b1987f5ca2"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.75.sha256sum] = "f6af063034fc1935ede7be0122941bafa9bacb949334d090b77ca98b5817c7d9"
SRC_URI[target-lexicon-0.12.4.sha256sum] = "c02424087780c9b71cc96799eaeddff35af2bc513278cda5c99fc1f5d026d3c1"
SRC_URI[termcolor-1.1.3.sha256sum] = "bab24d30b911b2376f3a13cc2cd443142f0c81dda04c118693e35b3835757755"
SRC_URI[thiserror-1.0.63.sha256sum] = "c0342370b38b6a11b6cc11d6a805569958d54cfa061a29969c3b5ce2ea405724"
SRC_URI[thiserror-impl-1.0.63.sha256sum] = "a4558b58466b9ad7ca0f102865eccc95938dca1a74a856f2b57b6629050da261"
SRC_URI[tinytemplate-1.2.1.sha256sum] = "be4d6b5f19ff7664e8c98d03e2139cb510db9b0a60b55f8e8709b689d939b6bc"
SRC_URI[toml-0.8.19.sha256sum] = "a1ed1f98e3fdc28d6d910e6737ae6ab1a93bf1985935a1193e68f93eeb68d24e"
SRC_URI[toml_datetime-0.6.8.sha256sum] = "0dd7358ecb8fc2f8d014bf86f6f638ce72ba252a2c3a2572f2a795f1d23efb41"
SRC_URI[toml_edit-0.22.20.sha256sum] = "583c44c02ad26b0c3f3066fe629275e50627026c51ac2e595cca4c230ce1ce1d"
SRC_URI[trybuild-1.0.99.sha256sum] = "207aa50d36c4be8d8c6ea829478be44a372c6a77669937bb39c698e52f1491e8"
SRC_URI[unicode-ident-1.0.1.sha256sum] = "5bd2fe26506023ed7b5e1e315add59d6f584c621d037f9368fea9cfb988f368c"
SRC_URI[unindent-0.2.3.sha256sum] = "c7de7d73e1754487cb58364ee906a499937a0dfabd86bcb980fa99ec8c8fa2ce"
SRC_URI[walkdir-2.3.2.sha256sum] = "808cf2735cd4b6866113f648b791c6adc5714537bc222d9347bb203386ffda56"
SRC_URI[wasm-bindgen-0.2.81.sha256sum] = "7c53b543413a17a202f4be280a7e5c62a1c69345f5de525ee64f8cfdbc954994"
SRC_URI[wasm-bindgen-backend-0.2.81.sha256sum] = "5491a68ab4500fa6b4d726bd67408630c3dbe9c4fe7bda16d5c82a1fd8c7340a"
SRC_URI[wasm-bindgen-macro-0.2.81.sha256sum] = "c441e177922bc58f1e12c022624b6216378e5febc2f0533e41ba443d505b80aa"
SRC_URI[wasm-bindgen-macro-support-0.2.81.sha256sum] = "7d94ac45fcf608c1f45ef53e748d35660f168490c10b23704c7779ab8f5c3048"
SRC_URI[wasm-bindgen-shared-0.2.81.sha256sum] = "6a89911bd99e5f3659ec4acf9c4d93b0a90fe4a2a11f15328472058edc5261be"
SRC_URI[web-sys-0.3.58.sha256sum] = "2fed94beee57daf8dd7d51f2b15dc2bcde92d7a72304cdf662a4371008b71b90"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.5.sha256sum] = "70ec6ce85bb158151cae5e5c87f95a8e97d2c0c4b001223f33a334e3ce5de178"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-targets-0.48.5.sha256sum] = "9a2fa6e2155d7247be68c096456083145c183cbbbc2764150dda45a87197940c"
SRC_URI[windows_aarch64_gnullvm-0.48.5.sha256sum] = "2b38e32f0abccf9987a4e3079dfb67dcd799fb61361e53e2882c3cbaf0d905d8"
SRC_URI[windows_aarch64_msvc-0.48.5.sha256sum] = "dc35310971f3b2dbbf3f0690a219f40e2d9afcf64f9ab7cc1be722937c26b4bc"
SRC_URI[windows_i686_gnu-0.48.5.sha256sum] = "a75915e7def60c94dcef72200b9a8e58e5091744960da64ec734a6c6e9b3743e"
SRC_URI[windows_i686_msvc-0.48.5.sha256sum] = "8f55c233f70c4b27f66c523580f78f1004e8b5a8b659e05a4eb49d4166cca406"
SRC_URI[windows_x86_64_gnu-0.48.5.sha256sum] = "53d40abd2583d23e4718fddf1ebec84dbff8381c07cae67ff7768bbf19c6718e"
SRC_URI[windows_x86_64_gnullvm-0.48.5.sha256sum] = "0b7b52767868a23d5bab768e390dc5f5c55825b6d30b86c844ff2dc7414044cc"
SRC_URI[windows_x86_64_msvc-0.48.5.sha256sum] = "ed94fce61571a4006852b7389a063ab983c02eb1bb37b47f8272ce92d06d9538"
SRC_URI[winnow-0.6.18.sha256sum] = "68a9bda4691f099d435ad181000724da8e5899daa10713c2d432552b9ccd3a6f"

SRC_URI:append = " ${CRATES_LIST}"

inherit pypi
inherit python_setuptools3_rust
inherit_defer native

PYPI_PACKAGE = "libcst"

RDEPENDS:${PN}::class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-difflib \
    nativesdk-python3-io \
    nativesdk-python3-json \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-pickle \
    nativesdk-python3-pyyaml \
    nativesdk-python3-unittest \
"
