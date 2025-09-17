SUMMARY = "A concrete syntax tree with AST-like properties"
HOMEPAGE = "https://github.com/Instagram/LibCST"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=bb0bb1a5e064e5019d855a2d28147544 \
    file://native/libcst/LICENSE;md5=bb0bb1a5e064e5019d855a2d28147544 \
    file://native/libcst/src/tokenizer/core/LICENSE;md5=baa042022c799cfd984b3354c4c1ccc1 \
    file://native/libcst_derive/LICENSE;md5=bb0bb1a5e064e5019d855a2d28147544 \
"

DEPENDS += "nativesdk-python3-pyyaml"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

CRATES_LIST = "\
    crate://crates.io/aho-corasick/1.0.4 \
    crate://crates.io/anes/0.1.6 \
    crate://crates.io/annotate-snippets/0.11.5 \
    crate://crates.io/anstyle/1.0.10 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bumpalo/3.12.0 \
    crate://crates.io/cast/0.3.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/ciborium-io/0.2.0 \
    crate://crates.io/ciborium-ll/0.2.0 \
    crate://crates.io/ciborium/0.2.0 \
    crate://crates.io/clap/4.5.38 \
    crate://crates.io/clap_builder/4.5.38 \
    crate://crates.io/clap_lex/0.7.4 \
    crate://crates.io/criterion-plot/0.5.0 \
    crate://crates.io/criterion/0.6.0 \
    crate://crates.io/crossbeam-deque/0.8.1 \
    crate://crates.io/crossbeam-epoch/0.9.9 \
    crate://crates.io/crossbeam-utils/0.8.10 \
    crate://crates.io/difference/2.0.0 \
    crate://crates.io/either/1.6.1 \
    crate://crates.io/equivalent/1.0.1 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/half/1.8.2 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/indexmap/2.4.0 \
    crate://crates.io/indoc/2.0.4 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itertools/0.13.0 \
    crate://crates.io/itertools/0.14.0 \
    crate://crates.io/itoa/1.0.2 \
    crate://crates.io/js-sys/0.3.77 \
    crate://crates.io/libc/0.2.149 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/memoffset/0.9.0 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/once_cell/1.16.0 \
    crate://crates.io/oorandom/11.1.3 \
    crate://crates.io/paste/1.0.15 \
    crate://crates.io/peg-macros/0.8.5 \
    crate://crates.io/peg-runtime/0.8.5 \
    crate://crates.io/peg/0.8.5 \
    crate://crates.io/plotters-backend/0.3.7 \
    crate://crates.io/plotters-svg/0.3.7 \
    crate://crates.io/plotters/0.3.7 \
    crate://crates.io/portable-atomic/1.4.3 \
    crate://crates.io/proc-macro2/1.0.95 \
    crate://crates.io/pyo3-build-config/0.25.1 \
    crate://crates.io/pyo3-ffi/0.25.1 \
    crate://crates.io/pyo3-macros-backend/0.25.1 \
    crate://crates.io/pyo3-macros/0.25.1 \
    crate://crates.io/pyo3/0.25.1 \
    crate://crates.io/quote/1.0.40 \
    crate://crates.io/rayon-core/1.13.0 \
    crate://crates.io/rayon/1.11.0 \
    crate://crates.io/regex-automata/0.4.9 \
    crate://crates.io/regex-syntax/0.8.5 \
    crate://crates.io/regex/1.11.2 \
    crate://crates.io/rustversion/1.0.21 \
    crate://crates.io/ryu/1.0.10 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/serde/1.0.208 \
    crate://crates.io/serde_derive/1.0.208 \
    crate://crates.io/serde_json/1.0.125 \
    crate://crates.io/serde_spanned/0.6.7 \
    crate://crates.io/syn/2.0.101 \
    crate://crates.io/target-lexicon/0.13.2 \
    crate://crates.io/target-triple/0.1.4 \
    crate://crates.io/termcolor/1.1.3 \
    crate://crates.io/thiserror-impl/2.0.12 \
    crate://crates.io/thiserror/2.0.12 \
    crate://crates.io/tinytemplate/1.2.1 \
    crate://crates.io/toml/0.8.19 \
    crate://crates.io/toml_datetime/0.6.8 \
    crate://crates.io/toml_edit/0.22.20 \
    crate://crates.io/trybuild/1.0.105 \
    crate://crates.io/unicode-ident/1.0.18 \
    crate://crates.io/unicode-width/0.2.0 \
    crate://crates.io/unindent/0.2.3 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/wasm-bindgen-backend/0.2.100 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.100 \
    crate://crates.io/wasm-bindgen-macro/0.2.100 \
    crate://crates.io/wasm-bindgen-shared/0.2.100 \
    crate://crates.io/wasm-bindgen/0.2.100 \
    crate://crates.io/web-sys/0.3.77 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/winnow/0.6.18 \
"

SRC_URI[sha256sum] = "f0f105d32c49baf712df2be360d496de67a2375bcf4e9707e643b7efc2f9a55a"

SRC_URI[aho-corasick-1.0.4.sha256sum] = "6748e8def348ed4d14996fa801f4122cd763fff530258cdc03f64b25f89d3a5a"
SRC_URI[anes-0.1.6.sha256sum] = "4b46cbb362ab8752921c97e041f5e366ee6297bd428a31275b9fcf1e380f7299"
SRC_URI[annotate-snippets-0.11.5.sha256sum] = "710e8eae58854cdc1790fcb56cca04d712a17be849eeb81da2a724bf4bae2bc4"
SRC_URI[anstyle-1.0.10.sha256sum] = "55cc3b69f167a1ef2e161439aa98aed94e6028e5f9a59be9a6ffb47aef1651f9"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[bumpalo-3.12.0.sha256sum] = "0d261e256854913907f67ed06efbc3338dfe6179796deefc1ff763fc1aee5535"
SRC_URI[cast-0.3.0.sha256sum] = "37b2a672a2cb129a2e41c10b1224bb368f9f37a2b16b612598138befd7b37eb5"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[ciborium-0.2.0.sha256sum] = "b0c137568cc60b904a7724001b35ce2630fd00d5d84805fbb608ab89509d788f"
SRC_URI[ciborium-io-0.2.0.sha256sum] = "346de753af073cc87b52b2083a506b38ac176a44cfb05497b622e27be899b369"
SRC_URI[ciborium-ll-0.2.0.sha256sum] = "213030a2b5a4e0c0892b6652260cf6ccac84827b83a85a534e178e3906c4cf1b"
SRC_URI[clap-4.5.38.sha256sum] = "ed93b9805f8ba930df42c2590f05453d5ec36cbb85d018868a5b24d31f6ac000"
SRC_URI[clap_builder-4.5.38.sha256sum] = "379026ff283facf611b0ea629334361c4211d1b12ee01024eec1591133b04120"
SRC_URI[clap_lex-0.7.4.sha256sum] = "f46ad14479a25103f283c0f10005961cf086d8dc42205bb44c46ac563475dca6"
SRC_URI[criterion-0.6.0.sha256sum] = "3bf7af66b0989381bd0be551bd7cc91912a655a58c6918420c9527b1fd8b4679"
SRC_URI[criterion-plot-0.5.0.sha256sum] = "6b50826342786a51a89e2da3a28f1c32b06e387201bc2d19791f622c673706b1"
SRC_URI[crossbeam-deque-0.8.1.sha256sum] = "6455c0ca19f0d2fbf751b908d5c55c1f5cbc65e03c4225427254b46890bdde1e"
SRC_URI[crossbeam-epoch-0.9.9.sha256sum] = "07db9d94cbd326813772c968ccd25999e5f8ae22f4f8d1b11effa37ef6ce281d"
SRC_URI[crossbeam-utils-0.8.10.sha256sum] = "7d82ee10ce34d7bc12c2122495e7593a9c41347ecdd64185af4ecf72cb1a7f83"
SRC_URI[difference-2.0.0.sha256sum] = "524cbf6897b527295dff137cec09ecf3a05f4fddffd7dfcd1585403449e74198"
SRC_URI[either-1.6.1.sha256sum] = "e78d4f1cc4ae33bbfc157ed5d5a5ef3bc29227303d595861deb238fcec4e9457"
SRC_URI[equivalent-1.0.1.sha256sum] = "5443807d6dff69373d433ab9ef5378ad8df50ca6298caf15de6e52e24aaf54d5"
SRC_URI[glob-0.3.0.sha256sum] = "9b919933a397b79c37e33b77bb2aa3dc8eb6e165ad809e58ff75bc7db2e34574"
SRC_URI[half-1.8.2.sha256sum] = "eabb4a44450da02c90444cf74558da904edde8fb4e9035a9a6a4e15445af0bd7"
SRC_URI[hashbrown-0.14.5.sha256sum] = "e5274423e17b7c9fc20b6e7e208532f9b19825d82dfd615708b70edd83df41f1"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[indexmap-2.4.0.sha256sum] = "93ead53efc7ea8ed3cfb0c79fc8023fbb782a5432b52830b6518941cebe6505c"
SRC_URI[indoc-2.0.4.sha256sum] = "1e186cfbae8084e513daff4240b4797e342f988cecda4fb6c939150f96315fd8"
SRC_URI[itertools-0.10.5.sha256sum] = "b0fd2260e829bddf4cb6ea802289de2f86d6a7a690192fbe91b3f46e0f2c8473"
SRC_URI[itertools-0.13.0.sha256sum] = "413ee7dfc52ee1a4949ceeb7dbc8a33f2d6c088194d9f922fb8318faf1f01186"
SRC_URI[itertools-0.14.0.sha256sum] = "2b192c782037fadd9cfa75548310488aabdbf3d2da73885b31bd0abd03351285"
SRC_URI[itoa-1.0.2.sha256sum] = "112c678d4050afce233f4f2852bb2eb519230b3cf12f33585275537d7e41578d"
SRC_URI[js-sys-0.3.77.sha256sum] = "1cfaf33c695fc6e08064efbc1f72ec937429614f25eef83af942d0e227c3a28f"
SRC_URI[libc-0.2.149.sha256sum] = "a08173bc88b7955d1b3145aa561539096c421ac8debde8cbc3612ec635fee29b"
SRC_URI[log-0.4.17.sha256sum] = "abb12e687cfb44aa40f41fc3978ef76448f9b6038cad6aef4259d3c095a2382e"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[memoffset-0.6.5.sha256sum] = "5aa361d4faea93603064a027415f07bd8e1d5c88c9fbf68bf56a285428fd79ce"
SRC_URI[memoffset-0.9.0.sha256sum] = "5a634b1c61a95585bd15607c6ab0c4e5b226e695ff2800ba0cdccddf208c406c"
SRC_URI[num-traits-0.2.15.sha256sum] = "578ede34cf02f8924ab9447f50c28075b4d3e5b269972345e7e0372b38c6cdcd"
SRC_URI[once_cell-1.16.0.sha256sum] = "86f0b0d4bf799edbc74508c1e8bf170ff5f41238e5f8225603ca7caaae2b7860"
SRC_URI[oorandom-11.1.3.sha256sum] = "0ab1bc2a289d34bd04a330323ac98a1b4bc82c9d9fcb1e66b63caa84da26b575"
SRC_URI[paste-1.0.15.sha256sum] = "57c0d7b74b563b49d38dae00a0c37d4d6de9b432382b2892f0574ddcae73fd0a"
SRC_URI[peg-0.8.5.sha256sum] = "9928cfca101b36ec5163e70049ee5368a8a1c3c6efc9ca9c5f9cc2f816152477"
SRC_URI[peg-macros-0.8.5.sha256sum] = "6298ab04c202fa5b5d52ba03269fb7b74550b150323038878fe6c372d8280f71"
SRC_URI[peg-runtime-0.8.5.sha256sum] = "132dca9b868d927b35b5dd728167b2dee150eb1ad686008fc71ccb298b776fca"
SRC_URI[plotters-0.3.7.sha256sum] = "5aeb6f403d7a4911efb1e33402027fc44f29b5bf6def3effcc22d7bb75f2b747"
SRC_URI[plotters-backend-0.3.7.sha256sum] = "df42e13c12958a16b3f7f4386b9ab1f3e7933914ecea48da7139435263a4172a"
SRC_URI[plotters-svg-0.3.7.sha256sum] = "51bae2ac328883f7acdfea3d66a7c35751187f870bc81f94563733a154d7a670"
SRC_URI[portable-atomic-1.4.3.sha256sum] = "31114a898e107c51bb1609ffaf55a0e011cf6a4d7f1170d0015a165082c0338b"
SRC_URI[proc-macro2-1.0.95.sha256sum] = "02b3e5e68a3a1a02aad3ec490a98007cbc13c37cbe84a3cd7b8e406d76e7f778"
SRC_URI[pyo3-0.25.1.sha256sum] = "8970a78afe0628a3e3430376fc5fd76b6b45c4d43360ffd6cdd40bdde72b682a"
SRC_URI[pyo3-build-config-0.25.1.sha256sum] = "458eb0c55e7ece017adeba38f2248ff3ac615e53660d7c71a238d7d2a01c7598"
SRC_URI[pyo3-ffi-0.25.1.sha256sum] = "7114fe5457c61b276ab77c5055f206295b812608083644a5c5b2640c3102565c"
SRC_URI[pyo3-macros-0.25.1.sha256sum] = "a8725c0a622b374d6cb051d11a0983786448f7785336139c3c94f5aa6bef7e50"
SRC_URI[pyo3-macros-backend-0.25.1.sha256sum] = "4109984c22491085343c05b0dbc54ddc405c3cf7b4374fc533f5c3313a572ccc"
SRC_URI[quote-1.0.40.sha256sum] = "1885c039570dc00dcb4ff087a89e185fd56bae234ddc7f056a945bf36467248d"
SRC_URI[rayon-1.11.0.sha256sum] = "368f01d005bf8fd9b1206fb6fa653e6c4a81ceb1466406b81792d87c5677a58f"
SRC_URI[rayon-core-1.13.0.sha256sum] = "22e18b0f0062d30d4230b2e85ff77fdfe4326feb054b9783a3460d8435c8ab91"
SRC_URI[regex-1.11.2.sha256sum] = "23d7fd106d8c02486a8d64e778353d1cffe08ce79ac2e82f540c86d0facf6912"
SRC_URI[regex-automata-0.4.9.sha256sum] = "809e8dc61f6de73b46c85f4c96486310fe304c434cfa43669d7b40f711150908"
SRC_URI[regex-syntax-0.8.5.sha256sum] = "2b15c43186be67a4fd63bee50d0303afffcef381492ebe2c5d87f324e1b8815c"
SRC_URI[rustversion-1.0.21.sha256sum] = "8a0d197bd2c9dc6e53b84da9556a69ba4cdfab8619eb41a8bd1cc2027a0f6b1d"
SRC_URI[ryu-1.0.10.sha256sum] = "f3f6f92acf49d1b98f7a81226834412ada05458b7364277387724a237f062695"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[scopeguard-1.1.0.sha256sum] = "d29ab0c6d3fc0ee92fe66e2d99f700eab17a8d57d1c1d3b748380fb20baa78cd"
SRC_URI[serde-1.0.208.sha256sum] = "cff085d2cb684faa248efb494c39b68e522822ac0de72ccf08109abde717cfb2"
SRC_URI[serde_derive-1.0.208.sha256sum] = "24008e81ff7613ed8e5ba0cfaf24e2c2f1e5b8a0495711e44fcd4882fca62bcf"
SRC_URI[serde_json-1.0.125.sha256sum] = "83c8e735a073ccf5be70aa8066aa984eaf2fa000db6c8d0100ae605b366d31ed"
SRC_URI[serde_spanned-0.6.7.sha256sum] = "eb5b1b31579f3811bf615c144393417496f152e12ac8b7663bf664f4a815306d"
SRC_URI[syn-2.0.101.sha256sum] = "8ce2b7fc941b3a24138a0a7cf8e858bfc6a992e7978a068a5c760deb0ed43caf"
SRC_URI[target-lexicon-0.13.2.sha256sum] = "e502f78cdbb8ba4718f566c418c52bc729126ffd16baee5baa718cf25dd5a69a"
SRC_URI[target-triple-0.1.4.sha256sum] = "1ac9aa371f599d22256307c24a9d748c041e548cbf599f35d890f9d365361790"
SRC_URI[termcolor-1.1.3.sha256sum] = "bab24d30b911b2376f3a13cc2cd443142f0c81dda04c118693e35b3835757755"
SRC_URI[thiserror-2.0.12.sha256sum] = "567b8a2dae586314f7be2a752ec7474332959c6460e02bde30d702a66d488708"
SRC_URI[thiserror-impl-2.0.12.sha256sum] = "7f7cf42b4507d8ea322120659672cf1b9dbb93f8f2d4ecfd6e51350ff5b17a1d"
SRC_URI[tinytemplate-1.2.1.sha256sum] = "be4d6b5f19ff7664e8c98d03e2139cb510db9b0a60b55f8e8709b689d939b6bc"
SRC_URI[toml-0.8.19.sha256sum] = "a1ed1f98e3fdc28d6d910e6737ae6ab1a93bf1985935a1193e68f93eeb68d24e"
SRC_URI[toml_datetime-0.6.8.sha256sum] = "0dd7358ecb8fc2f8d014bf86f6f638ce72ba252a2c3a2572f2a795f1d23efb41"
SRC_URI[toml_edit-0.22.20.sha256sum] = "583c44c02ad26b0c3f3066fe629275e50627026c51ac2e595cca4c230ce1ce1d"
SRC_URI[trybuild-1.0.105.sha256sum] = "1c9bf9513a2f4aeef5fdac8677d7d349c79fdbcc03b9c86da6e9d254f1e43be2"
SRC_URI[unicode-ident-1.0.18.sha256sum] = "5a5f39404a5da50712a4c1eecf25e90dd62b613502b7e925fd4e4d19b5c96512"
SRC_URI[unicode-width-0.2.0.sha256sum] = "1fc81956842c57dac11422a97c3b8195a1ff727f06e85c84ed2e8aa277c9a0fd"
SRC_URI[unindent-0.2.3.sha256sum] = "c7de7d73e1754487cb58364ee906a499937a0dfabd86bcb980fa99ec8c8fa2ce"
SRC_URI[walkdir-2.3.2.sha256sum] = "808cf2735cd4b6866113f648b791c6adc5714537bc222d9347bb203386ffda56"
SRC_URI[wasm-bindgen-0.2.100.sha256sum] = "1edc8929d7499fc4e8f0be2262a241556cfc54a0bea223790e71446f2aab1ef5"
SRC_URI[wasm-bindgen-backend-0.2.100.sha256sum] = "2f0a0651a5c2bc21487bde11ee802ccaf4c51935d0d3d42a6101f98161700bc6"
SRC_URI[wasm-bindgen-macro-0.2.100.sha256sum] = "7fe63fc6d09ed3792bd0897b314f53de8e16568c2b3f7982f468c0bf9bd0b407"
SRC_URI[wasm-bindgen-macro-support-0.2.100.sha256sum] = "8ae87ea40c9f689fc23f209965b6fb8a99ad69aeeb0231408be24920604395de"
SRC_URI[wasm-bindgen-shared-0.2.100.sha256sum] = "1a05d73b933a847d6cccdda8f838a22ff101ad9bf93e33684f39c1f5f0eece3d"
SRC_URI[web-sys-0.3.77.sha256sum] = "33b6dd2ef9186f1f2072e409e99cd22a975331a6b3591b12c764e0e55c60d5d2"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.5.sha256sum] = "70ec6ce85bb158151cae5e5c87f95a8e97d2c0c4b001223f33a334e3ce5de178"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[winnow-0.6.18.sha256sum] = "68a9bda4691f099d435ad181000724da8e5899daa10713c2d432552b9ccd3a6f"

SRC_URI:append = " ${CRATES_LIST}"

inherit pypi
inherit python_setuptools3_rust
inherit_defer nativesdk

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
